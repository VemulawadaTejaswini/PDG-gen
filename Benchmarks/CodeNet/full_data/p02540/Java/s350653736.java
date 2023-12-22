import java.util.Scanner;
 public class Main { 	 public static void main(String[] args){ 	
Scanner sc = new Scanner(System.in); 		int n = sc.nextInt();
 int hako[][] = new int[2][n];
int ans[] = new int[n]; 		 	
for(int i=0;i<=n;i++) { 
hako[0][n]=sc.nextInt(); 
hako[1][n]=sc.nextInt(); 
ans[i]++; 
} 		 		 
for(int i=0;i<=n;i++) { 			 
for(int j=0;j<=n;j++) { 				 
if(hako[0][i] > hako[0][j] && hako[1][i] > hako[1][j] || hako[0][i] < hako[0][j] && hako[1][i] < hako[1][j]{ 					 
ans[i]++; 				 
} 
} 		 
}
 for(int i=0;i<n;i++){ System.out.println(ans[i]);
 } 	
 } } 
