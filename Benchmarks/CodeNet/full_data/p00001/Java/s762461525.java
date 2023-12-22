class Main{
    public static void main(String[] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1819);
        list.add(2003);
        list.add(876);
        list.add(2840);
        list.add(1723);
        list.add(1673);
        list.add(3776);
        list.add(2848);
        list.add(1592);
        list.add(922);

        Colection.sort(list);
        Collection.reverse(list);
        for(int index=0;index<3;index++) {
            System.out.println(list.get(index));
        }
    }
}