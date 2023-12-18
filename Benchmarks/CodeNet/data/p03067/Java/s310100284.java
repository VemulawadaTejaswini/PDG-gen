import java.util.Scanner;
class T12019A{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int flag=0;
        if(a<b){
            if(a<c&&c<b){
                flag++;
            }
        }else{
            if(b<c&&c<a){
                flag++;
            }
        }
        
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
