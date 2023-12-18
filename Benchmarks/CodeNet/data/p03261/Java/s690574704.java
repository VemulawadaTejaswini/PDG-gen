import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String word[] = new String[100];
		int i = 0;
		int j = 0;
		int flag = 0;
		
		word[i] = sc.next();
		i++;
		
		
		try{
			while(flag == 0){
				
				
				word[i] = sc.next();
				
				
				for(j = 0;j < i;j++){
					if(word[i].equals(word[j])){
						flag = 1;
						System.out.println("No");
					}
				}
				i++;
			}
		}catch(NullPointerException e){
			System.out.println("Yes");
		}
		catch(NoSuchElementException e){
			System.out.println("Yes");
		}
	}
}
