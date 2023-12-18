import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int change=scn.nextInt();
        String text=scn.next();
        for(int i=0;i<n;i++){
            if(i==change-1){
                System.out.print(text.toLowerCase().charAt(i));
            }else{
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
    }
}
