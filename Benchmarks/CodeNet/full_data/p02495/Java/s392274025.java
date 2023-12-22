import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] ags){
	Scanner sc=new Scanner(Sysetm.in);
	while (true){
            int	h=sc.nextInt();
            int	w=sc.nextInt();
            if (h==0&&w==0) break;
            for	(int i=0;i<h;i++){
		for (int j=0;j<w;j++){
                    if ((i+j)%2==0)
			System.out.print("#");
                    else
			System.out.print(".");
                }
		System.out.print("\n");
            }
        }
    }
}