

import java.util.*;



public class Main {

	public static void main(String[] args) {
		char a[];
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine().toCharArray();
		for(int i=0;i<a.length;i++){
			if((char)('a')<=a[i]&&a[i]<=(char)('z')){
				a[i]=(char) (a[i]-'a'+'A');
			}
		}
		System.out.println(a);
	}
}