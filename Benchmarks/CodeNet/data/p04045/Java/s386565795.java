import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String N=sc.next();
String[]parts = N.split("");
int K=sc.nextInt();

List<Integer> list = new ArrayList<Integer>();
List<Integer> alist = new ArrayList<Integer>();

	for(int i = 0; i < K; i++){
		list.add(sc.nextInt());
	}

	for(int i = 0; i < 10 ; i++) {
	    if(! list.contains(i)) {
	 		alist.add(i);
		}
	}
	int min = 0;
	if(alist.contains(0)) {
	  min = 0;
	} 
	
	int fmin = 9;
	for(int i : alist) {
		if(i < fmin && i != 0) {
			fmin = i;
		}
	}
	
	for(int i = 0; i < parts.length; i++) {
		if(list.contains(Integer.valueOf(parts[i]))) {
			if(i == 0) {
			 parts[i] = Integer.toString(fmin);
			} else {
			 parts[i] = Integer.toString(min);
			}
		}
		System.out.print(parts[i]);
	}
	
	

}
}