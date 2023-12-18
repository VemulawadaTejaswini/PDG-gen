import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] ar =new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
            if(ar[i]!=i+1) cnt++;
        }
        if(cnt<=2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
