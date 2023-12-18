import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        int K_MAX = (int) (Math.log(b) / Math.log(2)) + 1;
        long[] digits = new long[K_MAX];
        for (int k = 0; k < K_MAX; k++) {
            if (k == 0) {
                digits[k] = calcDigitFor0(a, b, k);
            } else {
                digits[k] = calcDigit(a, b, k);
            }
        }

        long ans = 0;
        for (int k = 0; k < K_MAX; k++) {
            ans += Math.pow(2, k) * digits[k];
        }
        System.out.println(ans);
    }

    static long calcDigit(long a, long b, int k) {
        long target = (long) Math.pow(2, k + 1);
        long center = (long) Math.pow(2, k);
        long restA = a % target;
        long restB = b % target;
        if (restA < restB) {
            if (restB < center) {
                return 0;
            } else if (restA < center && restB >= center) {
                return (restB - center + 1) % 2;
            } else {
                return (restB - restA + 1) % 2;
            }
        } else if (restA == restB) {
            if (restA >= center) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (restA < center) {
                return 0;
            } else if (restB < center && restA >= center) {
                return (target - restA) % 2;
            } else {
                return ((target - restA) + restB - center + 1) % 2;
            }
        }
    }


    static long calcDigitFor0(long a, long b, int k) {
        long target = (long) Math.pow(2, 2);
        long restA = a % target;
        long restB = b % target;
        if (restA == restB) {
            if (restA == 1 || restA == 3) {
                return 1;
            } else {
                return 0;
            }
        } else if (restA < restB) {
            if (restA == 0) {
                if (restB == 1) {
                    return 1;
                } else if (restB == 2) {
                    return 1;
                } else if (restB == 3) {
                    return 0;
                }
            } else if (restA == 1) {
                if (restB == 2) {
                    return 1;
                } else if (restB == 3) {
                    return 0;
                }
            } else if (restA == 2) {
                return 1;
            }
        } else {
            if (restA == 3) {
                if (restB == 2) {
                    return 0;
                } else if (restB == 1) {
                    return 0;
                } else if (restB == 0) {
                    return 1;
                }
            } else if (restA == 2) {
                if (restB == 1) {
                    return 0;
                } else if (restB == 0) {
                    return 1;
                }
            } else if (restA == 1) {
                return 0;
            }
        }
        return 0;
    }
}
