import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
      	char[] input = inp.toCharArray();
      	boolean flag = true;	
      for(int i = 0; i < inp.length(); i++){
        	if(i%2 == 0){
              if(input[i] != 'R' && input[i] != 'U' && input[i] != 'D'){
                flag = !flag;
                break;
              }
            }else{
              if(input[i] != 'L' && input[i] != 'U' && input[i] != 'D'){
                flag = !flag;
                break;
              }
            }      
        }
      	if(flag)
          System.out.println("Yes");
      	else
          System.out.println("No");
		
	}
}