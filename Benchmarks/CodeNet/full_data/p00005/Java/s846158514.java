import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
//            IntStream lineStream = Arrays.stream(sc.nextLine().split(" "))
//                    .mapToInt(Integer::parseInt);
//            int[] il = lineStream.toArray();
//            int a = il[0];
//            int b = il[1];
            Long a = Long.parseLong(line[0]);
            Long b = Long.parseLong(line[1]);
            System.out.println(gcd(a, b) + " " + lcm(a, b));
        }
    }

    private static Long gcd(Long a, Long b){
        Long base = Math.max(a, b);
        Long next = Math.min(a, b);
        Long residue = base % next;
        while (residue != 0){
            residue =  base % next;
            base = next;
            next = residue;
        }
        return base;
    }

    private static Long lcm(Long a, Long b){
        Long g = gcd(a, b);
        return a / g * b;
    }
}