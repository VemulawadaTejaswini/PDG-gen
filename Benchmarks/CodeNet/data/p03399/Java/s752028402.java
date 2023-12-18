import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int trainFeeOfTicketForOnce = Integer.parseInt(br.readLine());
            int trainFeeOfUnlimitedRide = Integer.parseInt(br.readLine());
            int busFeeOfTicketForOnce = Integer.parseInt(br.readLine());
            int busFeeOfUnlimitedRide = Integer.parseInt(br.readLine());

            int selectedTrainFee = selectFee(trainFeeOfTicketForOnce, trainFeeOfUnlimitedRide);
            int selectedBusFee = selectFee(busFeeOfTicketForOnce, busFeeOfUnlimitedRide);
            int selectedTransportationFee = selectedTrainFee + selectedBusFee;

            System.out.println(selectedTransportationFee);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static int selectFee(int ticketForOnce, int unlimitedRide) {
        int selectedFee = ticketForOnce;
        if (ticketForOnce > unlimitedRide) {
            selectedFee = unlimitedRide;
        }

        return selectedFee;
    }
}