import java.util.*;

class Main{
	public static int caluc(int multi){
		int digit = String.valueOf(multi).length();	
		String strMulti = String.valueOf(multi);
		String[] part = strMulti.split("");
		int tmp = 0;
		for(int i=0; i<digit; i++){
			tmp += Integer.valueOf(part[i]);
		}
		
		return tmp;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		ArrayList<Integer> array = new ArrayList<Integer>();
		int min = n;
		int tmp = n+1;

		int i = 2;
		while(array.indexOf(n) == -1){
                        try{
			   tmp = caluc(n*i);
                        }catch(NumberFormatException e){
                           tmp = n;
                        }
			array.add(tmp); 
			if(min > tmp ){
				min = tmp;
			}
			i++;
		}

		System.out.println(min);	
  	}
}