import java.lang.reflect.Field;
import java.util.*;

public class Main {

	class Candidate{
		int id;
		int stone;
		Candidate(){};
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int p = in.nextInt();
			if(n*p==0){
				break;
			}

			int candidate[] = new int[n];
			Arrays.fill(candidate, 0);
			int Field = p;
			Boolean flag = false;
			while(true){
				for (int i = 0; i < n; i++) {
					if(Field!=0){
						candidate[i]++;
						Field--;
					}else{
						Field += candidate[i];
						candidate[i] = 0;
					}
					if(candidate[i]==p){
						System.out.println(i);
						flag = true;
						break;
					}
				}
				if(flag==true){
					break;
				}
			}
		}

	}

}