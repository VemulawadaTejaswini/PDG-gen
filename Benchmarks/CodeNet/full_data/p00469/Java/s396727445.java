import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	int n = Integer.valueOf(sc.readLine());
	int k = Integer.valueOf(sc.readLine());
	if(n==0 && k==0)
	break;
	String[] str = new String[n];
	TreeSet<String> set = new TreeSet<String>();
	for(int i=0; i<n; i++)
		str[i] = sc.readLine();
	if(k==2){
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++){
		if(j==i) continue;
		String a = new StringBuilder(str[i]).append(str[j]).toString();
		set.add(a);
		}
	}
	else if(k==3){
	for(int i=0; i<n; i++)
		for(int j=0; j<n; j++)
			for(int l=0; l<n; l++){
			if(l==i || l==j || j==i) continue;
			System.out.println(i+" "+j+" "+l);
			String a = new StringBuilder(str[i]).append(str[j]).append(str[l]).toString();
			set.add(a);
		}
	}
	else if(k==4){
	for(int i=0; i<n; i++)
		for(int j=0; j<n && j!=i; j++)
			for(int l=0; l<n && l!=i && l!=j; l++)
				for(int m=0; m<n; m++){
				if(m==i || m==j || m==l || l==i || l==j || j==i) continue;
				String a = new StringBuilder(str[i]).append(str[j]).append(str[l]).append(str[m]).toString();
				set.add(a);
		}
	}
	System.out.println(set.size());
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}