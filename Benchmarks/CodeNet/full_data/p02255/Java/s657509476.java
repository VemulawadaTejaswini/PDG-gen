import java.util.Scanner;

public class Main{
	static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	int a = in.nextInt();
    	int[] ints = new int[a];
    	
    	for (int i=0; i<a; i++) {
            ints[i] = in.nextInt();
        }
    	int MyArray;
    	for (int i=0; i<a; i++) {
    		MyArray = ints[i];
            
            int j = i - 1;
            while (j>=0 && ints[j]>MyArray) {
                ints[j+1] = ints[j];
                j--;
            }
            ints[j+1] = MyArray;
            print(ints);
    	}
    }
            static void print (int num[]) {
                for (int i=0; i<num.length; i++) {
                    System.out.print(num[i]);
                    if (i!=num.length-1) {System.out.print(" ");}
                }
                System.out.println();
            
            
    	       
            }
}

