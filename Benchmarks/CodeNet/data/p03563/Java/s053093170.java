import java.util.*;
class Main{

int n;
int t[102];
int v[101];
int a[20100];
int b[20100];
int s;
double ans;
 
public static void  main(String args[]){
Scanner in = new Scanner (System.in);	
n = Integer.parseInt(in.next());
	for(int i=1; i<=n; ++i){
		t[i]=Integer.parseInt(in.next());
		s += t[i];
		t[i] += t[i-1];
	}
	++t[n+1];
	t[n+1] += t[n];
//	for(int i=0; i<=n+1; ++i) printf("%d\t", t[i]);
//	printf("\n");
	for(int i=1; i<=n; ++i){
		v[i]=Integer.parseInt(in.next());
		for(int j=t[i-1]; j<t[i]; ++j) b[j] = v[i];
	}
	for(int i=0; i<=s; ++i) a[i] = Math.min(i, s-i);
//	for(int i=0; i<=s; ++i) printf("%d\t", a[i]);
//	printf("\n");
	for(int i=1; i<=n; ++i){
		for(int j=t[i-1]; j<=t[i]; ++j) a[j] = Math.min(a[j], v[i]);
		for(int j=t[i-1]; j>=0; --j) a[j] = Math.min(a[j], v[i]+t[i-1]-j);
		for(int j=t[i]; j<=s; ++j) a[j] = Math.min(a[j], v[i]+j-t[i]);
	}
//	for(int i=0; i<=s; ++i) printf("%d\t", a[i]);
//	printf("\n");
	for(int i=1; i<s; ++i) ans += (float)a[i];
	for(int i=1; i+3<s; ++i){
		if(a[i]+1==a[i+1] && a[i+1]==a[i+2] && a[i+2]-1==a[i+3] && b[i+1]>a[i+1] && b[i+2]>a[i+2])
			ans += 0.25;
	}
	Sytem.out.println(ans);
//	for(int i=1; i<s; ++i) printf("%d %d\n", a[i], b[i]);
}}