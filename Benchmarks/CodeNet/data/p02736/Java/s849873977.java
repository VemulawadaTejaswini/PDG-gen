class Main
{
	public static void main(String[] args)
    {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int n = Integer.parseInt(br.readLine());
      	String num = br.readLine();
      	while(num.length()!=1)
        {
        	char temp[] = new char[num.length()-1];
          	for(int i = 0 ; i < num.length()-1 ; i++)
            {
              int digit1 = Integer.parseInt(String.valueOf(num.charAt(i)));
              int digit2 = Integer.parseInt(String.valueOf(num.charAt(i+1)));
				              
              temp[i] = (char)(Math.abs(digit1-digit2)+'0');
            }
          num = new String(temp);
        }
        System.out.println(num);
        
    }
}