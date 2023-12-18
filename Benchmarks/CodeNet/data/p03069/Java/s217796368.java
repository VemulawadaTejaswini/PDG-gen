import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        List<Integer> array = new ArrayList<Integer>();
        int count = 0;
		//int sum = 0;
		int min = num;
for(int i=0; i<num; i++){
  if(line[i].equals(".")) count++;
}
int sum = count;
for(int i=0; i<num; i++){
  if(line[i].equals("#")) sum++;
  else sum--;
  //System.out.println(sum);
  if(sum < min) min = sum;
}
System.out.println(min);
    }
}