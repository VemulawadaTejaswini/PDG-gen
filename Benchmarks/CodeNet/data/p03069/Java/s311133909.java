import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        int count = 0;
        int countB = 0;
        int countW = 0;
        int i = 0;
        while(i<num-1){
          if(line[i].equals("#")) countB++;
          if(line[i].equals("#") && line[i+1].equals(".")) {
            i++;
            while(true){
              if(line[i].equals(".")) countW++;
              if(line[i].equals("#") || i==num-1) {
                if(countB <= countW) count += countB;
                else count += countW;
                countB = 1;
                countW = 0;
                break; 
              }
              i++;
            }
          }
          i++;
        }
		System.out.println(count);
	}
}
