public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int overseaStudent = 1;
        String s = sc.next();
        int passed = 0;

        for (int i = 0; i < n; i++) {
            String x = s.substring(i,i+1);
            switch (x){
                case "a":
                    if (passed < a + b) {
                        passed += 1;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case "b":
                    if (passed < a + b && overseaStudent <= b) {
                        passed += 1;
                        overseaStudent += 1;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case "c":
                    System.out.println("No");
                    break;
            }
        }
    }
}