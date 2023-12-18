public class App {
    public static void main(String[] args){

        //スキャン
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int m = s.nextInt();

        int hoge = (n * (n-1) + m * (m-1))/2;
        
        System.out.println(hoge);
    }

    
}