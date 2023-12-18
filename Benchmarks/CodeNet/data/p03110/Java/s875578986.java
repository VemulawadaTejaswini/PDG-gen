import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        double[] digits =new double[n];
        String[] kind=new String[n];
        for(int i=0;i<n;i++){
            digits[i]=scn.nextDouble();
            kind[i]=scn.next();
        }
        //処理
        double total=0;
        for(int i=0;i<n;i++){
            if(kind[i].equals("BTC")){
                total+=380000*digits[i];
                System.out.println(total);
            }else{
                total+=digits[i];
            }
        }
        //入力
        System.out.println(total);
    }
}
