import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=0;
        int flag=0;
        for(int i=0;i<n;i++){
            int buf=scn.nextInt();
            if(i==0){
                z = buf;
            }else{
                z = Math.max(z,buf);
            }
        }
        for(int i=0;i<m;i++){
            int buf = scn.nextInt();
            if(buf<=z){
                flag++;
                break;
            }
        }
        if(flag==0&&x<z&&z<=y){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
    }
}