import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int answer=1;
        for(int i=0;i<n;i++){
            answer=Math.min(answer*2,answer+k);
        }
      	System.out.println(answer);
    }
}