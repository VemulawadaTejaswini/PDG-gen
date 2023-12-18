import java.util.Scanner; 
class Main { public static void main(String[] args){ 
Scanner sc = new Scanner(System.in); 
int n=sc.nextInt(); int m=sc.nextInt(); 
int a[] = new int[n]; int b[]=new int[n]; 
for(int i=0; i<n; i++){ 
a[i]=sc.nextInt(); b[i]=sc.nextInt(); } 
for(int i=0; i<n; i++){ 
for(int j=i+1; j<n; j++){ 
if(a[i]>a[j]){ 
int dummy=a[i]; a[i]=a[j]; a[j]=dummy; 
dummy=b[i]; b[i]=b[j]; b[j]=dummy; }}} 
long sum =0; 
for(int i=0; i<m; i++){ 
m=m-b[i]; 
if (m>=0) sum=sum+a[i]*b[i]; 
else { sum=sum+a[i]*(m+b[i]); break; }} System.out.println(sum); }}
