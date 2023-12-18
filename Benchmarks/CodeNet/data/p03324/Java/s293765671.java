public class Main{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long D = sc.nextLong();
        long N = sc.nextLong();
        if(D == 0){
            if(N < 100){
                System.out.println(N);
            }else{
                System.out.println(100+1);
            }
        }else if(D == 1){
            if(N < 100){
                System.out.println(N*100);
            }else{
                System.out.println(100*100+100);
            }
        }else{
            if(N < 100){
                System.out.println(N*100*100);
            }else{
                System.out.println(100*100*100+10000);
            }
        }
         
    }
}