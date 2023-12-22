public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> inputs = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            if(!sc.hasNextInt()) {
                break;
            }
            int input = sc.nextInt();
            inputs.add(Integer.valueOf(input));
        }

        Collections.sort(inputs, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        
        for(int height : inputs.subList(0, Math.min(inputs.size(), 3))) {
            System.out.println(height);
        }
    }
}