class Main{
    public static void main(String[] a){
        for(int count = 1; count <= 9;count++){
            for(int count2 = 1;count2 <= 9;count2++){
                int result = count * count2;
                System.out.println(count + "x" + count2 + "=" + result);
            }
        }
    }
}