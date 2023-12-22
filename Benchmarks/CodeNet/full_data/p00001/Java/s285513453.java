import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
     File file = new File("test2.txt");
		
		try {
			Scanner input = new Scanner(file);
			
			int mtn1 = 0;
			int mtn2 = 0;
			int mtn3 = 0;
			int ctr = 0;
			while ((input.hasNextInt()) && ctr < 10) {
				int mtnheight = input.nextInt();
				if (mtnheight <= 10000) {
					if (mtnheight > mtn1){
						mtn3 = mtn2;
						mtn2 = mtn1;
						mtn1 = mtnheight;
					}else if (mtnheight > mtn2){
						mtn3 = mtn2;
						mtn2 = mtnheight;
					}else if (mtnheight > mtn3){
						mtn3 = mtnheight;
						}
				ctr = ctr + 1;
				}
			}	
			System.out.println(mtn1);
			System.out.println(mtn2);
			System.out.println(mtn3);
			}
			catch (IOException ex) {
			System.out.println(ex);
			}		
	
    }
}