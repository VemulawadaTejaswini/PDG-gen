class Main{
    public static void main(String[] a){
    Scanner in = new Scanner(System.in);
int[] arrInt = new int[10];
for(int i = 0; i < 10; i++)
arrInt[0] = in.nextInt();
in.close();
Arrays.sort(arrInt);
System.out.println(arrInt[arrInt.length-1]);
System.out.println(arrInt[arrInt.length-2]);
System.out.println(arrInt[arrInt.length-3]);
    }
}