public class Main {
    private static int N;
    private static int a[];

    private static int count4 = 0;
    private static int count2 = 0;

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
            if(a[i] % 4 == 0) count4++;  //4の倍数の個数をカウント
            else if(a[i] % 2 == 0) count2++;   //2の倍数をカウント
        }
    }

    public static void main(String args[]){
        //入力
        input();

        if(count4 + count2/2 > N/2) System.out.println("Yes");
        else System.out.println("No");
    }
}