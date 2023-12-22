import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int getcharoffset(String s, int idx){
	//	System.out.println("s:" + s);
	if (s.length() <= idx || s.length() == 0)return - 1;
	else{
	    return s.charAt(idx) - 'a';
	}
    }
    public static void main (String []args){
	
	// int n;
	// cin>>n;
	// string a[10000];
	// for(int k=0;k<n;k++){
	//     cin>>a[k];
	// }
	// int aa=0;
	// for(int l=1;l<n;l++){
	//     if(a[l]<=a[aa]){
	// 	aa=l;
	//     }
	// }
	// cout<<a[aa]<<endl;
	// return 0;

	Scanner sc = new Scanner(System.in);
	final int n = sc.nextInt();

	List<String> lst = new ArrayList<String>();
	for(int i=0;i<n;++i){
	    lst.add(sc.nextLine());
	}

	Collections.sort(lst);

	System.out.println(lst.get(1));
	
	sc.close();
    }
}