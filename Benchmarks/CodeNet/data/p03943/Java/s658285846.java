class probA{
static public void main(String[] args) 
{
int num[] = new num[3];
int i, sum = 0;
for (i = 0; i < 3; i++){
num[i] = parseInt(args[i]);
sum  += num[i];
}

for (i = 0; i < 3; i++){
if (sum - num[i] == num[i]){
System.out.println("Yes");
System.exit(0);
}
}
System.out.println("No");
System.exit(0);
}
}