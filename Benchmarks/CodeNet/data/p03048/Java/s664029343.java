import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
	int A = X / R;
	int B = X / G;
	int C = X / D;
        int res = 0;
        for (int a=0; a<=A; a++) {
            for (int b=0; b<=B; b++) {
		if ((X - a*R - b * G) %  B == 0){
                	res++;	
		}
                else{
			continue; 
		}
                  
            }
        }

        System.out.println(res);
    }
}
