class Main
{
	public static void main(String as[])
    {
		String a;
        Scanner sc=new Scanner(System.in);
      string es="es";
      String s="s";
      	a=sc.nextLine();
      if(a.charAt(a.length-1)==s)
      {
        a.charAt(a.length-1)='e';
        a+=s;
      }
      else
        a+=s;
      System.out.println(a);
    }
}
