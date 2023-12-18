import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
//        if (true) {
//            String s = "5 4 3 2 -1 0 0 0 0 0";
//            List<BigDecimal> list = combine(CalcType.TEST, Arrays.stream(s.split(" ")).map(BigDecimal::new).toArray(BigDecimal[]::new), 10);
//            list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//            return;
//        }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int outputOrderNumber = scanner.nextInt();

        BigDecimal[] allInput = new BigDecimal[num];
        for (int i = 0; i < num; i++) {
            allInput[i] = new BigDecimal(scanner.next());
        }

        // 全てを計算する必要はなく、負の数, 0 , 正の数の個数を把握したうえで、必要なIndex値の値を探しにいく感じ（らしい）
        Dto dto = count(allInput);

        CalcType calcType;
        int listCapacity;
        if (outputOrderNumber <= dto.minus) {
            // マイナス結果になるものだけを計算
            calcType = CalcType.MINUS;
            listCapacity = dto.minus;
        } else if (outputOrderNumber <= (dto.minus + dto.zero)) {
            // ゼロ結果になるものだけを計算 === 0
            System.out.println("0");
            return;
        } else {
            // プラス結果になるものだけを計算
            calcType = CalcType.PLUS;
            listCapacity = dto.plus;
        }

        int calculatedOutputIndex = calcType == CalcType.MINUS ? outputOrderNumber - 1 : outputOrderNumber - dto.minus - dto.zero - 1;

        List<BigDecimal> result = combine(calcType, allInput, listCapacity).stream()
                .sorted(Comparator.naturalOrder())
                .limit(calculatedOutputIndex + 1)
                .collect(Collectors.toList());

        System.out.println(result.get(calculatedOutputIndex).toPlainString());
    }

    static List<BigDecimal> combine(CalcType calcType, BigDecimal[] allInput, int listCapacity) {
        int length = allInput.length;
        if (length < 2) {
            return Collections.emptyList();
        }
        List<BigDecimal> resultList = new ArrayList<>(listCapacity);

        for (int leftIndex = 0; leftIndex < length; leftIndex++) {
            BigDecimal left = allInput[leftIndex];
            if (calcType.shouldThrough(left)) {
                continue;
            }
            for (int rightIndex = leftIndex + 1; rightIndex < length; rightIndex++) {
                BigDecimal right = allInput[rightIndex];

                if (calcType.shouldCalc(left, right)) {
                    resultList.add(left.multiply(right));
                }
            }
        }
        return resultList;
    }

    static Dto count(BigDecimal[] allInput) {
        int minus = 0, zero = 0, plus = 0;
        for (BigDecimal e : allInput) {
            int signum = e.signum();
            if (signum < 0) {
                minus++;
            } else if (signum == 0) {
                zero++;
            } else {
                plus++;
            }
        }
        // minus * minus -->> plus
        // minus * zero -->> zero
        // minus * plus -->> minus
        // zero * zero -->> zero
        // zero * plus -->> zero
        // plus * plus -->> plus
        return new Dto(
                combineOtherSignumCount(minus, plus),
                (combineOtherSignumCount(minus, zero) + combineSameSignumCount(zero) + combineOtherSignumCount(zero, plus)),
                (combineSameSignumCount(minus) + combineSameSignumCount(plus))
        );
    }

    static int combineOtherSignumCount(int leftSignumCount, int rightSignumCount) {
        return leftSignumCount * rightSignumCount;
    }

    static int combineSameSignumCount(int signumCount) {
        int pickCount = 2;
        int numerator = fact(signumCount); // 分子
        int denominator = fact(pickCount) * fact(signumCount - pickCount); // 分母
        return numerator / denominator;
    }

    static int fact(int length) {
        int sum = 1;
        for (int i = length; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }

    static enum CalcType {
        MINUS {
            boolean shouldCalc(BigDecimal left, BigDecimal right) {
                int leftSignum = left.signum();
                int rightSignum = right.signum();

                return (leftSignum < 0 && rightSignum > 0)
                        || (leftSignum > 0 && rightSignum < 0);
            }
        }, PLUS {
            boolean shouldCalc(BigDecimal left, BigDecimal right) {
                int leftSignum = left.signum();
                int rightSignum = right.signum();

                return (leftSignum < 0 && rightSignum < 0)
                        || (leftSignum > 0 && rightSignum > 0);
            }
        }, TEST {
            @Override
            boolean shouldThrough(BigDecimal base) {
                return false;
            }

            @Override
            boolean shouldCalc(BigDecimal left, BigDecimal right) {
                return true;
            }
        };

        boolean shouldThrough(BigDecimal base) {
            return base.signum() == 0;
        }

        abstract boolean shouldCalc(BigDecimal left, BigDecimal right);
    }

    static class Dto {
        int minus;
        int zero;
        int plus;

        public Dto(int minus, int zero, int plus) {
            this.minus = minus;
            this.zero = zero;
            this.plus = plus;
        }
    }
}