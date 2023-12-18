import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String line;
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < N; i++) {
        	line = sc.next();
        	int num = list.indexOf(line);

        	if(list.size() == 0 || num == -1) {
        		list.add(line);
        	}
        }

        int count = list.size();

        System.out.println(count);
    }
}