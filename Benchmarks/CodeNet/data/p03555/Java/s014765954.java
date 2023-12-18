import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] ones = str.split("");
		str = scan.next();
		String[] twos = str.split("");
		boolean flag = false; 
			

	 	if(ones[0].equals(twos[2])){
       			if(ones[1].equals(twos[1])){
       				if(ones[2].equals(twos[0])){
					flag = true;					
				}
       			}
    		}

		if(flag == true){
		        System.out.println("YES");
		}else{
			System.out.println("NO");
		}
  }
}