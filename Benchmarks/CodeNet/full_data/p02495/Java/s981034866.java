import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int	h=sc.nextInt();
            int	w=sc.nextInt();
            if(h==0&&w==0)break;
	    for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if((i==0||i%2==0)&&(j==0||j%2==0))System.out.print("#");
                    else if((i==0||i%2==0)&&j%2!=0)System.out.print(".");
                    else if(i%2!=0&&(j==0||j%2==0))System.out.print(".");
                    else if(i%2!=0&&j%2!=0)System.out.print("#");
                }
		System.out.println();
            }
	    System.out.println();
        }
    }
}