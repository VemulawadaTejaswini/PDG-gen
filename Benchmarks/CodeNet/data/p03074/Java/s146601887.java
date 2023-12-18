import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
        String[] line = new String[num];
        line = s.split("");
		//System.out.println(line.length);
        String former = line[0];
        int check = 0;
        int count = 1;
        int count2 = 0;
        int index = 0;
        int sum = 0;
        int max = 0;
        List<Integer> counter = new ArrayList<Integer>();
        if(line[0].equals("0")) check = 1;
        for(int i=1; i<num; i++){
          if(line[i].equals(former)){
            count++;
          }
          else{
            check++;
            count++;
            if(line[i].equals("0")) former = "0";
            else former = "1";
          }
          if(check == 2) count2++;
          if(check == 3){
            counter.add(count-1);
            count = count2+1;
            count2 = 0;
            check = 1;
          }
          
        }
        while(true){
          for(int j=index; j<k; j++){
             sum += counter.get(j);
          }
          if(max < sum) max = sum;
          sum = 0;
          index++;
          if(index+k >= counter.size()) break;
        }
        if(max <= 0) max = 1;
        System.out.println(max);
	}
}