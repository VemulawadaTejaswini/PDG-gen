public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countMul4 = 0;
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 4 == 0) {
                countMul4++;
            } else if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        if(countOdd <= countMul4) {
            System.out.println("Yes");
        } else if (n % 2 != 0 && n / 2 == countMul4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}