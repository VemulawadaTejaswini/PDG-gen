Scanner scan = new Scanner(System.in);

int line = scan.nextInt();
int sum = 0;

for(int i=1; i<line+1; i++) {
  sum += i;
}
System.out.println(sum);