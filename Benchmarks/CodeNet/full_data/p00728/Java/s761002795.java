import java.util.*;

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n,max=0,min=1000,seiseki=0;

while(n = scan.next() == null){
	int s[] = int[n];
	
	for (int i = 0;i == n;i++){
		s[i] = scan.next();
		sum = sum + s[i];

		if(max<s[i]){
			max = s[i];
		}

		if(min>s[i]){
			min = s[i];
		}
	}
	int seiseki = sum - (max + min) / (n - 2);
	System.out.println(seiseki);
}
}