import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        int count = 0;
        for(int i=0; i<num-1; i++){
          if(line[i].equals("#") && line[i+1].equals(".")) {
            count++;
            for(int j=1; j<=i; j++){
              if(line[i-j].equals("#")) count++; 
            }
          }
        }
		System.out.println(count);
	}
}
