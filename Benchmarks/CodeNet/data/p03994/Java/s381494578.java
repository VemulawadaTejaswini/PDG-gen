import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		int n = in.nextInt();
		
		char []arr = t.toCharArray();
		int index=0;
		while(n>0&&index<t.length()){
			if((26-(t.charAt(index)-'a'))<=n)
			{
				arr[index] = 'a';
				n-=26-(t.charAt(index)-'a');
			}
			index++;
		}
		
		index--;
		while(n>0){
			if(n>25-(arr[index]-'a')){
				if(arr[index]=='z'){
					arr[index]='a';
					n-=1;
				}
				else{
					n-=25-(arr[index]-'a');
					arr[index] = 'z';
				}
			}
			else{
				arr[index] =(char)(arr[index] +n);  
				n=0;
			}
			index--;
			
			if(index ==-1)
				index = t.length()-1;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		
		System.out.println();
	}

}
