class Coffee
{
  public static void main(String args[])
  {
    String S;
    int max = (S.length() < 6) ? S.length() : 6;
	S = S.substring(0, max).toLowerCase();
   scanf("%[^\n]%*c", S); 
   char ch1 = S.charAt(2);
    char ch2 = S.charAt(3);
    char ch3 = S.charAt(4);
    char ch4 = S.charAt(5);
    if(ch1 == ch2 && ch3 == ch4)
      printf("Yes");
    else
      printf("No");
  
   return 0; 
} 