Class ntl{
Public Static void main(String[] args) {
int n;
System.out.print(n + ":");
while(n%2 ==0){
System.out.print(" " + 2);
n /=2;???????? 
}
for(int i=3; i*i<=n; i+=2;){
while(n%i ==0){
System.out.print(" " + i);
n /= i;
}
}
if (n > 1) {
System.out.print(" " + n);
}
}
}