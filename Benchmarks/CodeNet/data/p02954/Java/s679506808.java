import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
      
      int length = s.length();
      char[] mass = new char[length];
      for(int i=0;i<length;i++){
        mass[i] = s.charAt(i);
      }
      int[] result = new int[length];
      for(int i=0;i<length;i++){
        int count=0;
        char prev = mass[i];
        int prev_num=i;
        int next_num = i;
        while(true){
          count++;
          if(prev=='L'){
            next_num= prev_num-1;
          }else{
            next_num= prev_num+1;
          }
          
          if(prev==mass[next_num]){
            prev_num=next_num;
            continue;
          }else{
            if(count%2==0){
              result[next_num]++;
              
            }else{
              result[prev_num]++;
            }
            break;
          }
        }
      }
      
      for(int i=0;i<length;i++){
        System.out.print(result[i]+" ");
      }


	}
}