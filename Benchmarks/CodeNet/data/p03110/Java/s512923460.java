public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double c = 0;
        for (int i = 0;i < N; i++){
            double a = sc.nextDouble();
            String st = sc.next();
            if (st.equals("JPY")) {
                c += a;
            }
            else if (st.equals("BTC")) {
                c += a * 380000;
            }
        }
        System.out.println(c);
    }
}