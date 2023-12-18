import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int k = sc.nextInt();
		int[] r = new int[k];
		for(int i=0; i<k; i++){
			r[i] = sc.nextInt();
		}
			
		int q = sc.nextInt();
		int[] t = new int[q];
		int[] a = new int[q];
		for(int i=0; i<q; i++){
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		
		int currentA;
		boolean AisTop;
		int sub1, sub2;
		for(int i=0; i<q; i++){
			currentA = a[i];
			AisTop = true;
			for(int j=0; j<k; j++){
				if(j==0){
					sub1 = r[j];
					sub2 = t[i];
				}else{
					sub1 = r[j] - r[j-1];
					sub2 = t[i] - r[j-1];
				}
				if(AisTop){
					if(r[j]<t[i]){
						if(currentA<sub1){
							currentA=0;
						}else{
							currentA-=sub1;
						}
					}else{
						if(currentA<sub2){
							currentA=0;
							break;
						}else{
							currentA-=sub2;
							break;
						}
					}
				}else{
					if(r[j]<t[i]){
						if(x-currentA<sub1){
							currentA=x;
						}else{
							currentA+=sub1;
						}
					}else{
						if(x-currentA<sub2){
							currentA=x;
							break;
						}else{
							currentA+=sub2;
							break;
						}
					}
				}
				if(AisTop){
					AisTop = false;
				}else{
					AisTop = true;
				}
			}
			if(r[k-1]<t[i]){
				if(AisTop){
					if(currentA<t[i]-r[k-1]){
						currentA=0;
					}else{
						currentA-=t[i]-r[k-1];
					}
				}else{
					if(x-currentA<t[i]-r[k-1]){
						currentA=x;
					}else{
						currentA+=t[i]-r[k-1];
					}
				}
			}
			System.out.println(currentA);
		}
	}
}
