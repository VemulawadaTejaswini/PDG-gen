import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
        boolean hyaku=false;
        boolean ju=false;
        boolean iti=false;
        int result=0;
        for(int i=0; i<10; i++){
            for(int k=0; k<10; k++){
                for(int l=0; l<10; l++){
                    for(int m=0; m<N; m++){
                        if(hyaku==false && Character.valueOf(S[m])==i){
                           hyaku=true;
                           continue;
                        }
                        if(hyaku==true && ju==false && Character.valueOf(S[m])==k){
                           ju=true;
                           continue;
                        }
                        if(hyaku==true && ju==true && iti==false && Character.valueOf(S[m])==l){
                           iti=true;
                           break;
                        }
                    }
                if(hyaku && ju && iti){
                result++;
                }
                  hyaku=false;
                  ju=false;
                  iti=false;
                }
            }
        }
		System.out.println(result);
	}
}
