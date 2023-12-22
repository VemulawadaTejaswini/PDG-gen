import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int[] test;
	test = new int[3];
	int tmp;
	Scanner sc  = new Scanner(System.in);
	for(int i = 0; i<3; i++){
	    test[i] = sc.nextInt();
    }
    for(int s = 0; s<2;s++){
	    for(int j = s+1; j<3;j++){
	       if(test[s]>test[j]){
	           tmp = test[s];
	           test[s] = test[j];
	           test[j] = tmp;
           }
        }
    }
		System.out.println(test[0]+ " "+test[1]+" "+test[2]);

		}
    }
   
