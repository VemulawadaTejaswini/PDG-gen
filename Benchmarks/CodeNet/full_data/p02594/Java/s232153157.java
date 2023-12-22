public class Main {

    public static void main(String[] args) throws Exception {
        var input = new String(System.in.readAllBytes());
        var degree = Integer.parseInt(input);
        var roomTemperature = new RoomTemperature(degree);
        if (roomTemperature.isTooHot()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static class RoomTemperature {
        private final int degree;
        public RoomTemperature(int degree) {
            this.degree = degree;
        }
        public boolean isTooHot() {
            if (degree >= 30) {
                return true;
            } else {
                return false;
            }
        }
    }
}