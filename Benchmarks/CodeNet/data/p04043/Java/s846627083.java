public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
	sc.close();
	
  if(A + B + C == 19 && (( A == 7 || A == 5 ) && ( B == 7 || B == 5 ) && ( C == 7 || C == 5 ))){
  	 System.out.println("YES");
  }else {
     System.out.println("NO");
  }

}