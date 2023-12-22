class Main{
    public static void main(String[] a){

        for (int i = 1; i <=9; ++i) {
            for (int j = 0; j <= 9; ++j) {
                StringBuilder sb = new StringBuilder();
                System.out.println(sb.append(i).append('x').append(j).append('=').append(i*j).toString());
            }
        }

    }
}